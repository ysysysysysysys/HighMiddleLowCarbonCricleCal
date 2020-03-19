import java.util.Scanner;

public class MainCal {
    public static void main(String[] args) {
        System.out.println("请输入年龄:");
        Scanner scAge = new Scanner(System.in);
        Double age = scAge.nextDouble();

        System.out.println("请输入体重kg:");
        Scanner scWeight = new Scanner(System.in);
        Double weight = scWeight.nextDouble();

        System.out.println("请输入身高cm:");
        Scanner scHeight = new Scanner(System.in);
        Double height = scHeight.nextDouble();

        System.out.println("请输入体脂率%:");
        Scanner scBodyFat = new Scanner(System.in);
        Double bodyFat = scBodyFat.nextDouble()/100;


        Double BMR = 66+(13.7*weight)+(5*height)-(6.8*age);
        Double dayLose = BMR*1.6;
        Double getCalorie = dayLose -(dayLose*0.2);
        Double shortHeight = weight - (weight*bodyFat);


        Double midleTanshui = 1.25*(weight/0.45);
        Double midleDanbai = 1.1*(shortHeight/0.45);
        Double midleZhifang = (getCalorie - (midleTanshui+midleDanbai)*4)/9;

        System.out.println("低碳水:"+midleTanshui*0.25+" 中蛋低:"+midleDanbai+ " 低脂肪:"+midleZhifang*1.5);
        System.out.println("中碳水:"+midleTanshui+" 中蛋白:"+midleDanbai+ " 中脂肪:"+midleZhifang);
        System.out.println("高碳水:"+midleTanshui*1.75+" 高蛋白:"+midleDanbai+ " 高脂肪:"+midleZhifang*0.5);



    }
}
