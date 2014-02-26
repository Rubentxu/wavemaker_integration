dojo.declare("ObjectFilter", wm.Page, {
objType: null,
timeout: null,
selectedItem: null,
start: function() {
},
"preferredDevice": "desktop",
searchFieldChange: function(inSender, inDisplayValue, inDataValue, inSetByCode) {
if (this.timeout) {
clearTimeout(this.timeout);
}
this.timeout = setTimeout(dojo.hitch(this, this.updateVar), 1000);
},
updateVar: function() {
//TODO: implement short delay
this.searchVar.input.setValue("type", this.objType);
this.searchVar.input.setValue("searchString", this.searchField.getDataValue());
this.searchVar.update();
},
searchVarSuccess: function(inSender, inDeprecated) {
this.objectList.setDataSet(this.searchVar);
},
objectListSelect: function(inSender, inItem) {
// Workaround for the problem of not receiving inSender param in onSelect()
// handler in ObjectChooser component.
this.selectedItem = inSender.selectedItem.getData();
},
_end: 0
});

ObjectFilter.widgets = {
compositePublisher: ["wm.CompositePublisher", {"description":"Filtering object chooser","displayName":"ObjectFilter","group":"vCO Widgets","namespace":"o11n","publishName":"ObjectFilter"}, {}],
searchVar: ["wm.ServiceVariable", {"autoUpdate":true,"inFlightBehavior":"executeLast","operation":"getItemsBySearchString","service":"CatalogService"}, {"onSuccess":"searchVarSuccess"}, {
input: ["wm.ServiceInput", {"type":"getItemsBySearchStringInputs"}, {}]
}],
onSelect: ["wm.Property", {"isEvent":true,"property":"objectList.onSelect","type":"string"}, {}],
onDblclick: ["wm.Property", {"isEvent":true,"property":"objectList.ondblclick","type":"string"}, {}],
layoutBox1: ["wm.Layout", {"horizontalAlign":"right","verticalAlign":"top"}, {}, {
searchField: ["wm.Text", {"caption":"Search","changeOnKey":true,"dataValue":undefined,"displayValue":"","width":"60%"}, {"onchange":"searchFieldChange"}],
objectList: ["wm.List", {"_classes":{"domNode":["GridListStyle"]},"border":"1","columns":[{"show":true,"field":"name","title":"Name","width":"100%","align":"left","formatFunc":"","editorProps":{"restrictValues":true},"mobileColumn":false},{"show":false,"field":"data","title":"Data","width":"100%","align":"left","formatFunc":"","mobileColumn":false},{"show":false,"field":"type","title":"Type","width":"100%","align":"left","formatFunc":"","mobileColumn":false},{"show":false,"field":"href","title":"Href","width":"100%","align":"left","formatFunc":"","mobileColumn":false},{"show":false,"field":"PHONE COLUMN","title":"-","width":"100%","align":"left","expression":"\"<div class='MobileRowTitle'>Name: \" + ${name} + \"</div>\"\n","mobileColumn":false}],"headerVisible":false,"height":"100%","minDesktopHeight":60}, {"onSelect":"objectListSelect"}, {
binding: ["wm.Binding", {}, {}, {
wire: ["wm.Wire", {"expression":undefined,"source":"searchVar","targetProperty":"dataSet"}, {}]
}]
}]
}]
};

ObjectFilter.prototype._cssText = '';
ObjectFilter.prototype._htmlText = '';