function AbstractExternalClass() {}
AbstractExternalClass.prototype.abstractFunction = function() {
    throw new Error("Calling abstract function AbstractExternalClass.abstractFunction");
}
AbstractExternalClass.prototype.removedAbstractFunction = function() {
    throw new Error("Calling abstract function AbstractExternalClass.removedAbstractFunction");
}
// AbstractExternalClass.prototype.addedAbstractFunction = function() {
//     throw new Error("Calling abstract function AbstractExternalClass.addedAbstractFunction");
// }
AbstractExternalClass.prototype.function = function() {
    return "AbstractExternalClass.function";
}
AbstractExternalClass.prototype.removedFunction = function() {
    return "AbstractExternalClass.removedFunction";
}
// AbstractExternalClass.prototype.addedFunction = function() {
//     return "AbstractExternalClass.addedFunction";
// }
