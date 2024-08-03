package store.ggun.admin.repository.dao;
import store.ggun.admin.domain.dto.TransactionDTO;

import java.util.List;
import java.util.Map;


public interface TransactionDao {

    Long countAllTransactions();

    List<TransactionDTO> getAllTransactions();

    Map<String, Double> getTotalByDate();

    Map<String, Map<String, Integer>> getQuantityByDate();

    Long getTransactionsById();

    List<String> getTransactionsByUsername();

    Map<String, Double> getNetProfitByDate();

    List<TransactionDTO> getTransactionsByNetProfit();

}

