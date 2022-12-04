import { describe, expect, test } from "@jest/globals";
import { removeDuplicates } from "./removeDuplicates";

describe("Remove duplicates", () => {
  test("remove duplicates", () => {
    expect(removeDuplicates()).toBe(5);
  });

  test("remove duplicates invoked with continuous ascending values as arg returns desired result", () => {
    expect(
      removeDuplicates([0, 0, 1, 1, 1, 2, 2, 3, 4, 4, 4, 5, 6, 6, 7])
    ).toBe(8);
  });

  test("remove duplicates with non-continuous ascending values with arg array returns desired result", () => {
    expect(removeDuplicates([0, 1, 1, 2, 2, 2, 3, 5, 6, 6, 7])).toBe(7);
  });

  test("removeDuplicates should throw error if the array passed in as the arg has a length of less than two =", () => {
    // Note to test thrown errors we must provide expect a callback invoking the function we expect to throw; https://medium.com/@afolabiwaheed/how-to-test-a-function-thats-expected-to-throw-error-in-jest-2419cc7c6462
    expect(() => {
      removeDuplicates([0]);
    }).toThrow("remove duplicates requires an array with at least 2 values");
  });
});
