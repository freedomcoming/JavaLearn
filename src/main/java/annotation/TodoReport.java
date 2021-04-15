package annotation;

import java.lang.reflect.Method;

public class TodoReport {

    public static void main(String[] args) {
        getToDoReportForBusinessLogic();
    }

    /**
     * 解析使用注解的类，获取通过注解设置的属性
     */
    private static void getToDoReportForBusinessLogic() {
        Class<BusinessLogic> businessLogicClass = BusinessLogic.class;
        for (Method method : businessLogicClass.getMethods()) {
            ToDo ToDoAnnotation = method.getAnnotation(ToDo.class);
            if (ToDoAnnotation != null) {
                System.out.println(" Method Name : " + method.getName());
                System.out.println(" Author : " + ToDoAnnotation.author());
                System.out.println(" Priority : " + ToDoAnnotation.priority());
                System.out.println(" Status : " + ToDoAnnotation.status());
                System.out.println(" --------------------------- ");
            }
        }
    }
}