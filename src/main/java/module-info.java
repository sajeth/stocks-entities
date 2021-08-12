/**
 * @author saji 06-Apr-2018
 */
module stocks.entities {
    requires java.persistence;
    exports com.saji.stocks.entities.batch to stocks.batch, stocks.core;
    exports com.saji.stocks.entities.watchlist to stocks.core;
    exports com.saji.stocks.entities.stocks to stocks.core;
    exports com.saji.stocks.entities.sector to stocks.core;
    exports com.saji.stocks.entities.data to stocks.core;
}