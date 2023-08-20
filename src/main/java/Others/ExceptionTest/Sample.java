package Others.ExceptionTest;

class FoolException extends RuntimeException {

}

public class Sample {
    public void sayNick(String nick) throws FoolException { // 호출자에게 throws exception
//        try {
//            if("바보".equals(nick)) {
//                throw new FoolException();
//            }
//            System.out.println("당신의 별명은 "+nick+" 입니다.");
//        } catch (FoolException e) {
//            System.out.println("FoolException이 발생했습니다.");
//        }
        if ("바보".equals(nick)) {
            throw new FoolException();
        }
        System.out.println("당신의 별명은 " + nick + " 입니다.");
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        try {
            sample.sayNick("바보");
            sample.sayNick("야호");
        } catch (FoolException e) {
            System.err.println("FoolException이 발생했습니다.");
        }
    }
}

