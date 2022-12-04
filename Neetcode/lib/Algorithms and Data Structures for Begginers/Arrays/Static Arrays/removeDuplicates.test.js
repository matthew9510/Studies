"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const globals_1 = require("@jest/globals");
const removeDuplicates_1 = require("./removeDuplicates");
(0, globals_1.describe)("Remove duplicates", () => {
    (0, globals_1.test)("remove duplicates", () => {
        (0, globals_1.expect)((0, removeDuplicates_1.removeDuplicates)()).toBe(5);
    });
    (0, globals_1.test)("remove duplicates invoked with continuous ascending values as arg returns desired result", () => {
        (0, globals_1.expect)((0, removeDuplicates_1.removeDuplicates)([0, 0, 1, 1, 1, 2, 2, 3, 4, 4, 4, 5, 6, 6, 7])).toBe(8);
    });
    (0, globals_1.test)("remove duplicates with non-continuous ascending values with arg array returns desired result", () => {
        (0, globals_1.expect)((0, removeDuplicates_1.removeDuplicates)([0, 1, 1, 2, 2, 2, 3, 5, 6, 6, 7])).toBe(7);
    });
    (0, globals_1.test)("removeDuplicates should throw error if the array passed in as the arg has a length of less than two =", () => {
        // Note to test thrown errors we must provide expect a callback invoking the function we expect to throw; https://medium.com/@afolabiwaheed/how-to-test-a-function-thats-expected-to-throw-error-in-jest-2419cc7c6462
        (0, globals_1.expect)(() => {
            (0, removeDuplicates_1.removeDuplicates)([0]);
        }).toThrow("remove duplicates requires an array with at least 2 values");
    });
});
//# sourceMappingURL=removeDuplicates.test.js.map