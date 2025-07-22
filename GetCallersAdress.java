package exceptions;

public class GetCallersAdress {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethod());
        method();
    }
    public static void method(){
        System.out.println(getCallerClassAndMethod());

    }
    public static String getCallerClassAndMethod() {
        RuntimeException path = new RuntimeException();
        String result = new String();
        if (path.getStackTrace()[1].getMethodName()=="main"){
            return null;
        }
        result = result.concat(path.getStackTrace()[1].getClassName()+"#"+path.getStackTrace()[1].getMethodName());
        return result;
    }
}
