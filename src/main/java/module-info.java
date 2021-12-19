/**
 * @author saji 06-Apr-2018
 */
module stocks.entities {
    requires java.persistence;
    exports com.saji.entities.transactions to stocks.batch, stocks.core;
    exports com.saji.entities.data to stocks.core;
    exports com.saji.entities.configurations to stocks.core;
    exports com.saji.entities.trading to stocks.core;
    exports com.saji.entities to stocks.core;
}