/**
 * Created by ltp on 2016/3/17.
 */
public class JunitTest {
    public String plus(double a,double b,double c){
        if(a+b<=c||b+c<=a||a+c<=b)return"This is not a trangle";
        else
        if(a==b&&a==c)return"This is an equilateral";
        else
        if(a==b||a==c||b==c)return "This is an isosceles";
        else return "This is a scalene";
    }
}
