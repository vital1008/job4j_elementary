package ru.job4j.condition;

public class Cinema2 {
    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static void permission (boolean allowByParent, boolean hasMoney) {
       if (allowByParent = true) {
          System.out.println("I can go to the cinema.");
}      else {
       System.out.println("I can't.");  }
       if (hasMoney = true) {
          System.out.println("I can go to the cinema.");
}      else  {
       System.out.println("I can't."); }
       if (allowByParent&&hasMoney) {
       System.out.println("I can go to the cinema.");
}      else System.out.println("I can't.");
}

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}


