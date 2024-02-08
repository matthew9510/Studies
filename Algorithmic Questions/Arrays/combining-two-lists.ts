function combineLists(
  array1: string[],
  array2: number[]
): Array<[string, number]> {
  if (array1.length !== array2.length) {
    throw Error("Arrays arguments must be of same length");
  }

  return array1.map((value: string, index: number) => {
    return [value, array2[index]];
  });
}

const movieList = ["Interstellar", "Batman", "Good Will Hunting", "Dune"];
const movieRatings = [10, 9, 9.5, 6.5];

const combinedList = combineLists(movieList, movieRatings);
console.log(combinedList);
