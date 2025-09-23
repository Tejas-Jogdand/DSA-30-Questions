public class zigzag {
    public static String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int row = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows[row].append(c);

            // Change direction if we hit top or bottom row
            if (row == 0 || row == numRows - 1) {
                goingDown = !goingDown;
            }

            row += goingDown ? 1 : -1;
        }

        // Combine all rows
        StringBuilder result = new StringBuilder();
        for (StringBuilder sb : rows) {
            result.append(sb);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;

        String result = convert(s, numRows);
        System.out.println("Input: " + s);
        System.out.println("numRows = " + numRows);
        System.out.println("Zigzag Conversion: " + result);

        // Try with another example
        int numRows2 = 4;
        String result2 = convert(s, numRows2);
        System.out.println("\nnumRows = " + numRows2);
        System.out.println("Zigzag Conversion: " + result2);
    }
}
