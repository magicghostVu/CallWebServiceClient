/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.run;

import java.util.Scanner;
import ws.sum.WebServiceSum;
import ws.sum.WebServiceSum_Service;

/**
 *
 * @author magic_000
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Nhập số thứ nhất: ");
        String num1= sc.next();
        System.out.println("Nhập số thứ hai: ");
        String num2= sc.next();
        WebServiceSum_Service service = new WebServiceSum_Service();
        String sum = service.getWebServiceSumPort().sum(num1, num2);
        System.out.println("Tổng là: "+ sum);
    }
}
