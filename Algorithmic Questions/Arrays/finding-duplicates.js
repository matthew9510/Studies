function findDuplicates(array) {
    // // make dict
    // for(let item of array){
    // }
    var dict = array.reduce(function (acc, item) {
        acc[item] = (acc[item] || 0) + 1;
        return acc;
    }, {});
    var arrayKeys = Object.keys(dict);
    var duplicates = [];
    for (var _i = 0, arrayKeys_1 = arrayKeys; _i < arrayKeys_1.length; _i++) {
        var key = arrayKeys_1[_i];
        if (dict[key] > 1) {
            duplicates.push(key);
        }
    }
    return duplicates;
}
var result = findDuplicates(["a", "b", "C", "c", "C"]);
console.log(result);
