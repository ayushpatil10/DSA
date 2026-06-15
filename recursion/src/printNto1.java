public static void printNto1(int n) {
    if (n == 0) return; // Base Case
    System.out.println(n); // Work
    printNto1(n - 1);// Recursive Call
    System.out.println(n); // Work
}

void main() {
    printNto1(5);
}