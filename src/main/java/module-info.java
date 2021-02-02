/**
 * @author saji 06-Apr-2018
 */
module stocks.entities {
    requires java.persistence;
    // requires static org.hibernate.orm.core;
    exports com.saji.stocks.entities.batch to stocks.batch, stocks.core;
    exports com.saji.stocks.entities.models to stocks.core;
    exports com.saji.stocks.entities.stock to stocks.core;
}