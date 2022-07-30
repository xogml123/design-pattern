package strategy.dao.userinfo.domain.dao.mysql;

import strategy.dao.userinfo.domain.dao.UserInfoDao;
import strategy.dao.userinfo.domain.entity.UserInfo;

public class MysqlDao implements UserInfoDao {

    private static final String DRIVER = "MSSQL DB";
    @Override
    public void insert(UserInfo userInfo) {
        System.out.println("insert into "
            + DRIVER + " userID = "
            + userInfo.getUserId());
    }

    @Override
    public void delete(String userId) {
        System.out.println("delete from "
            + DRIVER + " userID = "
            + userId);
    }

    @Override
    public void update(UserInfo userInfo) {
        System.out.println("update into "
            + DRIVER + " userID = "
            + userInfo.getUserId());
    }

}

