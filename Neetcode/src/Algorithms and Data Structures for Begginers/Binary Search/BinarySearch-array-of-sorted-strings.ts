function binarySearch(array: string[], target: string): number {
  let start = 0;
  let end = array.length - 1;

  while (start <= end) {
    let mid = Math.floor((start + end) / 2);

    if (array[mid] === target) {
      return mid;
    } else if (array[mid] < target) {
      start = mid + 1;
    } else {
      end = mid - 1;
    }
  }

  return -1;
}

function binarySearchRecursion(
  array: string[],
  target: string,
  start: number = 0,
  end: number = array.length - 1 // -1 because we are dealing with indexes - using just length would result in out of bounds error
): number {
  while (start <= end) {
    let mid = Math.floor((start + end) / 2);

    if (array[mid] === target) {
      return mid;
    } else if (array[mid] < target) {
      return binarySearchRecursion(array, target, mid + 1, end);
    } else {
      return binarySearchRecursion(array, target, 0, mid - 1);
    }
  }
  return -1;
}

const shoppingList = [
  "apples",
  "bananas",
  "bandanas",
  "blueberries",
  "plums",
  "zuchini",
];
const shoppingListOddAmountOfElements = [
  "apples",
  "bananas",
  "bandanas",
  "blueberries",
  "zuchini",
];
const searchItem = "bananas";
const idx = binarySearch(shoppingList, "bananas");
const idx2 = binarySearch(shoppingListOddAmountOfElements, "bananas");
const idx3 = binarySearchRecursion(shoppingListOddAmountOfElements, "bandanas");

console.log(idx);
console.log(idx2);
console.log(idx3);
