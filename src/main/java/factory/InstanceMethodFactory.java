package factory;

import com.ithaima.service.impl.AccountServiceImpl;

public class InstanceMethodFactory {
    public Object createAccountService(){
        System.out.println("<由InstanceMethodFactory产生AccountService>");
        return new AccountServiceImpl();
    }
}
