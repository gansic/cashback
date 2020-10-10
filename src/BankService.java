public class BankService {
    double calculate(int cafe, int gas, int other) {

        double cafeCash = 0.10;
        double gasoline = 0.05;
        double otherCash = 0.01;
        double allCashReturn = 3000;
        double cafePercent = (cafe * cafeCash) + (gas * gasoline) + (other * otherCash) / 100;
        return cafePercent;

        }

//        double gasPercent = gas * gasoline;
//        return gasPercent;
//        double diferent = other * otherCash;
//        return diferent;


//        // 1 bal = 1 rub
//
//
//
//
//        // 3000 rub
//        int win = 3000;
//        if (point == win) {
//            return win;
//        }
//        int credit = 1;
//        boolean profit = point == credit ;
//        return point;
    }

