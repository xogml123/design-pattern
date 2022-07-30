package strategy.dao.userinfo;

import strategy.dao.userinfo.domain.dao.UserInfoDao;
import strategy.dao.userinfo.domain.dao.mssql.MssqlDao;
import strategy.dao.userinfo.domain.dao.mysql.MysqlDao;
import strategy.dao.userinfo.domain.dao.oracle.OracleDao;

public class UserInfoDaoFactory {

    private static final UserInfoDaoFactory userInfoDaoFactory= new UserInfoDaoFactory();

    private UserInfoDaoFactory() {

    }

    public static UserInfoDaoFactory getInstance() {
        return userInfoDaoFactory;
    }

    public UserInfoDao getUserInfoDao(String type) {
        if (type.equals("MSSQL")) {
            return new MssqlDao();
        } else if (type.equals("MYSQL")) {
            return new MysqlDao();
        } else if (type.equals("ORACLE")) {
            return new OracleDao();
        } else {
            throw new IllegalArgumentException("Unknown type: " + type);
        }
    }

}
