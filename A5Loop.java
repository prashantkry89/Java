public class A5Loop {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 9, 10, 50, 70 };
        int n = arr.length, x = 0, y = 0;

        // ! for loop
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("----while loop-----");

        // ! while loop
        while (x < n) {
            System.out.println(arr[x]);
            x++;
        }

        // ! do while loop
        System.out.println("----do while loop-----");
        do {
            System.out.println(arr[y]);
            y++;
        } while (y < n);

        // ! break
        System.out.println("----Break-----");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
            if (arr[i] == 10)  break;
        }

        // ! continue 
        System.out.println("----continue-----");
        for (int i = 0; i < n; i++) {
            if (arr[i] == 10)   continue;
            System.out.println(arr[i]);
        }
    }
}
