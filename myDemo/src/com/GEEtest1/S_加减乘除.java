package com.GEEtest1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class S_加减乘除 {
	public static void main(String args[]){ 
        
        //得到输入的算数表达式
        String s=new String();
        System.out.println("输入算数表达式：");
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        try {
            s=bf.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         
        //通过正则表达式判断输入的是否正确
        Pattern p=Pattern.compile("([1-9][0-9]*[+\\-\\*/])+[1-9][0-9]*");
        Matcher m=p.matcher(s);
        if((m.matches()==true)){
            Expression ex=new Expression();
            ex.getExpression(s);
             
        }else{
            System.out.println("表达式输入有误！");
             
        }
    }
     
    //把算数表达式转化为后缀式（逆波兰式）
    private String getExpression(String expression){
        //存放操作符的栈
        Stack<Character> s1=new Stack<Character>();
        Stack<Object> s2=new Stack<Object>();
         
        int len=expression.length();
        //System.out.println(len);
        char c1;
         
        for(int i=0;i<len;i++){
            c1=expression.charAt(i);
            //s1.push('#');
            System.out.println(c1);
             
            if(isOperator(c1)==true){
                //System.out.println(c1);
                //操作数为操作符且优先级比s1栈顶操作符优先级高时，直接把操作符压入s1
                if(s1.empty()){
                    s1.push(c1);
                    //System.out.println(c1);
                }
                else {
                    if(priorityCompare(c1,s1.peek())==1){
                        s1.push(c1);
                        //System.out.println(s1.peek());
                    }
                     
                 
                    else{
                        //弹出s1栈顶的操作符并压入s2，直到c1优先级小于s1栈顶的操作符优先级
                        while(priorityCompare(c1,s1.peek())!=1){ 
                            s2.push(s1.pop());
                            System.out.println(s2.peek());
                        }
                        s1.push(c1);
                        //System.out.println(s1.peek());
                    }
                }
            }else{
                //若操作数为数字，直接压入s2中
                s2.push(c1);
                //System.out.println(c1);
            }
        }
        //把s1中剩余的元素压入s2中
        while(!s1.isEmpty()){
            s2.push(s1.pop());
            //System.out.println(s1.peek());
        }
        return count_result(s2);
     }
    //根据后序的计算出结果
    private String count_result(Stack<Object> ob) {
        //存放后序的栈
        Stack<Object> s3=new Stack<Object>();
        //计算结果的栈
        Stack<Double> s4=new Stack<Double>();
         
        while(!ob.isEmpty()){
            s3.push(ob.pop());
        }
         
        while(!s3.isEmpty()){
            if(!isOperator(s3.peek())){
                    s4.push((Double)(s3.pop()));
                     
            }
            else{
                    s4.push(cout(s4.pop(),s4.pop(),(char)s3.pop()));
                 
            }
        }
         
        return Double.toString(s4.peek());
    }
 
    private Double cout(double x, double y, char z) {
        double result=0;
        switch(z){
        case '+':
            result=x+y;
            break;
        case '-':
            result=x-y;
            break;
        case '*':
            result=x*y;
            break;
        case '/':
            result=x/y;
            break;
             
        }
        //System.out.println(result);
        return result;
    }
     
    //比较两个操作符的优先级
    private int priorityCompare(char c1, char c2) {
        switch(c1){
        case '+':
        case '-':
            return(c2=='*'||c2=='/'?-1:0);
        case '*':
        case '/':
            return(c2=='+'||c2=='-'?1:0);
        }
        return 1;
        //return getPriority(c1) - getPriority(c2);
 
         
    }
    /*int getPriority(char c) {
        if(c == '+' || c == '-')
            return 1;
        else 
            return 2;
    }*/
 
     
    //检测是否是操作符
    private boolean isOperator(Object o){
        //System.out.println("isO:"+o);
        char c1=(char)o;
        //System.out.println("isO:"+c1);
            if(c1=='+'||c1=='-'||c1=='*'||c1=='/'){
                //System.out.println("yes");
                return true;
            }
            else{
                //System.out.println("no");
                return false;
            }
                 
    }

}