public class sqrt {
    public static String computeSquareRoot(int num) {
        // TODO:
        double cRoot = 0;
        double dNum = (double) num;
        for (int i = 10; i >= -10; i--){
            for (int j = 0; j<=9; j++){
                if (Math.pow(cRoot + 1 * Math.pow(10,i),2) > dNum) break;

                cRoot = cRoot + 1 * Math.pow(10,i);
                System.out.println(cRoot);

            }


        }
        return String.format("%.2f", cRoot);
    }

    public static void main(String[] args) {
        System.out.println(computeSquareRoot(144));

    }

}
