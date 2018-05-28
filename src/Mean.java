/**
 * Created by magnus on 2018-05-14.
 */
public class Mean {

    public static void main(String[] args) {
        double mean = mean(1.5, 3, 4.2);
        System.out.println(mean);
    }


    /**
     * A method to calculate the mean of three doubles.
     * @param tal1 first parameter in mean-calculation
     * @param tal2 second parameter in mean-calculation
     * @param tal3 third parameter in mean-calculation
     * @return the mean of the three parameters
     */
    private static double mean(double tal1, double tal2, double tal3) {
        return (tal1+tal2+tal3)/3;
    }


}
