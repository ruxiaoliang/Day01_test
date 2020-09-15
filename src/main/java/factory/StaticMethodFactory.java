package factory;

import com.ithaima.service.impl.AccountServiceImpl;

public class StaticMethodFactory {
        public static Object createAccountService(){
            System.out.println("<由StaticMethodFactory产生AccountService>");
            return new AccountServiceImpl();
        }
}
