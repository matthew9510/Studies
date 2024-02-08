class HashMap {
  private state: { [key: string]: number };

  constructor() {
    this.state = {};
  }

  set(key: string, value: number): void {
    this.state[key] = value;
  }

  get(key: string): number | undefined {
    return this.state[key];
  }

  has(key: string): boolean {
    return this.state.hasOwnProperty(key);
  }
}

const hashMap = new HashMap();
hashMap.set("a", 100);
console.log(hashMap.get("a")); // Output: 100
