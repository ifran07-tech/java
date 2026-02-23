class Rotation {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {3, 4, 5, 1, 2};

        int n = a.length;

        if (a.length != b.length) {
            System.out.println("Not Rotation");
            return;
        }

        int i, j;

        for (i = 0; i < n; i++) {

            for (j = 0; j < n; j++) {
                if (a[(i + j) % n] != b[j]) {
                    
                }
            }

            if (j == n) {
                System.out.println("Rotation");
                
            }
        }

        System.out.println("Not Rotation");
    }
}
