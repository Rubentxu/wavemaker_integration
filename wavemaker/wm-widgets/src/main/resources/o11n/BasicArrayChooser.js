dojo.provide("common.packages.o11n.BasicArrayChooser");
 
dojo.declare("o11n.BasicArrayChooser", wm.Composite, {
  horizontalAlign: "left",
  verticalAlign: "top",
  layoutKind: "top-to-bottom",
	"preferredDevice": "desktop",
    
    item: null,

    arrayType: null,
    
    fieldType: null,
    
    decorators: null,
    
    constraints: null,
    
	start: function() {
        this.components.label1.setCaption("Array of " + this.arrayType);
        
        if (this.fieldType == "SIMPLE") {
            var componentType;
            if (this.arrayType == "string") {
                componentType = "o11n.VcoText";
            } else if (this.arrayType == "number") {
                componentType = "o11n.VcoNumber";
            } else if (this.arrayType == "boolean") {
                componentType = "wm.Checkbox";
            } else if (this.arrayType == "Date") {
                componentType = "o11n.VcoDate";
            }
            
            var decoratorsParam = {};
            if (this.decorators && this.decorators.predefinedList) {
                decoratorsParam.predefinedList = this.decorators.predefinedList;
            }
            
            this.item = this.components.itemPanel.createComponent("itemField_" + this.id, componentType, {
                showing: true,
                width: "500px",
                height: "26px",
                padding: "2, 5, 5, 10",
                caption: this.arrayType + ":",
                captionPosition: "top",
                captionAlign: "left",
                decorators: decoratorsParam,
                constraints: {},
                onEnterKeyPress: dojo.hitch(this, this.itemEnterKeyPress)
            });
            if (this.arrayType == "Date") {
                this.item.setCaption(this.arrayType + ":");  
            }
            
            this.item.setHeight("50px");
            this.components.itemPanel.setHeight("50px");
            
        } else if (this.fieldType == "SDK_OBJECT") {
            this.item = this.components.itemPanel.createComponent("itemField_" + this.id + "_chooser", "o11n.InventoryTree",
                            {showing: true,
                             width: "500px",
                             height: "100%",
                             objType: this.arrayType,
                             onDblclick: dojo.hitch(this, this.objChooserDblclick)
                            });
        } else {
            this.item = this.components.itemPanel.createComponent("itemField_" + this.id + "_chooser", "o11n.ObjectFilter",
                            {showing: true,
                             width: "500px",
                             height: "100%",
                             objType: this.arrayType,
                             onDblclick: dojo.hitch(this, this.objChooserDblclick)
                            });
        }
	},

    itemEnterKeyPress: function() {
        var simpleValue = this.item.dataValue;
        if (simpleValue) {
            if (this.item.displayValue) {
                this.addItem(this.item.displayValue, simpleValue);
            } else if (this.item.type == "o11n.VcoDate") {
                this.addItem(this.getFormattedDate(simpleValue), simpleValue);
            } else {
                this.addItem(simpleValue);
            }
        }
        this.item.clear();
	},
    
    getFormattedDate: function (millis) {
        return (new Date(millis)).toLocaleString();
    },
    
    objChooserDblclick: function() {
        this.addItem(this.item.selectedItem.name, this.item.selectedItem);
    },
    
    addItem: function(nameParam, valueParam) {
        if (!valueParam) {
            valueParam = nameParam;
        }
        this.components.selectionVar.addItem({dataValue: {name: nameParam, value: valueParam}});
    },
    
    setData: function(data) {
        this.components.selectionVar.setData(data);
        this.itemList.selectByIndex(-1); //visualization workaround        
    },
    
	deletePicClick: function(inSender) {
        if (!this.itemList.selectedItem.isEmpty()){
		    this.components.selectionVar.removeItem(this.itemList.getSelectedIndex());
        }
	},

    upPicClick: function(inSender) {
        var index = this.itemList.getSelectedIndex();
        // clone the item
        var thisItem = this.components.selectionVar.getItem(index);
        this.components.selectionVar.removeItem(index);
        this.components.selectionVar.addItem(thisItem, index - 1);
        this.itemList.selectByIndex(index - 1);
	},

    downPicClick: function(inSender) {
        var index = this.itemList.getSelectedIndex();
        // clone the item
        var thisItem = this.components.selectionVar.getItem(index);
        this.components.selectionVar.removeItem(index);
        this.components.selectionVar.addItem(thisItem, index + 1);
        this.itemList.selectByIndex(index + 1);
	},

	insertBtnClick: function(inSender) {
        if (this.fieldType == "SIMPLE") {
		    this.itemEnterKeyPress();
        } else {
            this.objChooserDblclick();    
        }
	},
	_end: 0
});
 
o11n.BasicArrayChooser.components = {
	selectionVar: ["wm.Variable", {"isList":true,"json":"[]","type":"AnyData"}, {}],
	label1: ["wm.Label", {"caption":"Array","padding":"4"}, {}],
	itemPanel: ["wm.Panel", {"height":"100%","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}],
	insertBtn: ["wm.Button", {"caption":"Insert","margin":"4"}, {"onclick":"insertBtnClick"}],
	itemListPanel: ["wm.Panel", {"height":"100%","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
		itemScrollerPanel: ["wm.Panel", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
			itemList: ["wm.List", {"_classes":{"domNode":["GridListStyle"]},"border":"1","columns":[{"show":true,"field":"dataValue.name","title":"Name","width":"100%","align":"left","editorProps":{"restrictValues":true},"isCustomField":true,"mobileColumn":true},{"show":false,"field":"dataValue","title":"DataValue","width":"100%","displayType":"Any","align":"left","formatFunc":""}],"headerVisible":false,"height":"100%","minDesktopHeight":60,"scrollToSelection":true}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"selectionVar","targetProperty":"dataSet"}, {}]
				}]
			}]
		}],
		panel3: ["wm.Panel", {"height":"100%","horizontalAlign":"center","verticalAlign":"top","width":"24px"}, {}, {
			deletePic: ["wm.Picture", {"height":"18px","source":"resources/images/o11n/deleteIconEnabled.png","width":"18px"}, {"onclick":"deletePicClick"}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":"${itemList.emptySelection}","targetProperty":"disabled"}, {}]
				}]
			}],
			upPic: ["wm.Picture", {"height":"18px","source":"resources/images/o11n/moveUp.png","width":"18px"}, {"onclick":"upPicClick"}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":"${itemList.emptySelection} || ${itemList.selectedIndex} == 0","targetProperty":"disabled"}, {}]
				}]
			}],
			downPic: ["wm.Picture", {"height":"18px","source":"resources/images/o11n/moveDown.png","width":"18px"}, {"onclick":"downPicClick"}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":"${itemList.emptySelection} || ${itemList.selectedIndex} == ${itemList.count} - 1","targetProperty":"disabled"}, {}]
				}]
			}]
		}]
	}]}
 
wm.publish(o11n.BasicArrayChooser, [
	["selectedItems", "selectionVar.queriedItems", {group: "Published", bindSource: true, type: "AnyData"}],
	["onSetData", "selectionVar.onSetData", {group: "Published", isEvent: true}]
]);
 
wm.registerPackage(["vCO Widgets", "BasicArrayChooser", "o11n.BasicArrayChooser", "common.packages.o11n.BasicArrayChooser", "images/wm/widget.png", "Basic Array Chooser", {width: "250px", height: "150px"},false]);