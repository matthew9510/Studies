function findDuplicates<T>(array: T[]): String[] {
  // // make dict
  // for(let item of array){

  // }

  let dict = array.reduce((acc, item) => {
    acc[item] = (acc[item] || 0) + 1;
    return acc;
  }, {});

  let arrayKeys = Object.keys(dict);
  let duplicates = [];
  for (let key of arrayKeys) {
    if (dict[key] > 1) {
      duplicates.push(key);
    }
  }
  return duplicates;
}
let result = findDuplicates(["a", "b", "C", "c", "C"]);

console.log(result);
