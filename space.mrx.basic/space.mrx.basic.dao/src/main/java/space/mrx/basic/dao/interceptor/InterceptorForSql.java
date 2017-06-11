package space.mrx.basic.dao.interceptor;

import java.util.Properties;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

@Intercepts({  
    @Signature(type = Executor.class, method = "update", args = {  
            MappedStatement.class, Object.class }),  
    @Signature(type = Executor.class, method = "query", args = {  
            MappedStatement.class, Object.class, RowBounds.class,  
            ResultHandler.class }) })
public class InterceptorForSql implements Interceptor{

    private static final Logger LOGGER = Logger.getLogger(InterceptorForSql.class);
    
    public Object intercept(Invocation invocation) throws Throwable {
        // TODO Auto-generated method stub
        
        
        LOGGER.warn(invocation);
        
        
        
        return null;
    }

    public Object plugin(Object arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    public void setProperties(Properties arg0) {
        // TODO Auto-generated method stub
        
    }

}
