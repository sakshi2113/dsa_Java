package Arrays;

public class TypeOfTriangle {
    public static String triangleType(int[] tri) {
        int a = tri[0], b = tri[1], c = tri[2];

        // valid triangle check
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "none";
        }

        // Now check the type
        if (a == b && b == c) {
            return "equilateral";
        } else if (a == b || b == c || a == c) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }
}
