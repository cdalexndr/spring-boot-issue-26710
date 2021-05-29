package example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import javax.annotation.PostConstruct;


@Service
public class SomeService {
    private static final Logger log = LoggerFactory.getLogger(SomeService.class);

    @PostConstruct
    public void postCtr(){
        checkTransactional();
    }

    @Transactional
    public void checkTransactional(){
        if (!isInsideTransaction()) {
            log.error("Not inside transaction");
            throw new IllegalStateException("Not inside transaction");
        }
    }

    public static boolean isInsideTransaction() {
        return TransactionSynchronizationManager.isActualTransactionActive();
    }
}
