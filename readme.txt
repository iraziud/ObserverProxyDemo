This project illustrates use of the Observer design patter along with the Proxy Design pattern.

To demonstrate use of observer design pattern, we have considered the example of the stock market.
In stock markets, there are number of stocks listed in the market and there are many stock holders
who continuously checks for the stock prices.
Here we have created one Stock class which implements Observable interface that means this stock can
be observed by others.
We have also created StockObserver class which implements Observer interface which means StockObserver is
actually going to observe changes in the Stock class.

Whenever we change the Stock price, that will be communicated to all StockObservers which are observing
Stock class. We must note that, before any StockObserver can observer Stock class, we need to register
StockObserver with Stock class by call addObserver method.


Now to illustrate Proxy Design Pattern, we have created StockProxy, which acts as the Proxy for Stock class.
We can access all functionality of Stock class using StockProxy class, which hides all complexity associated
with the Stock class.