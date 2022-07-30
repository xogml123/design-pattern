package strategy.dao.userinfo;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import strategy.dao.userinfo.UserInfoDaoFactory;
import strategy.dao.userinfo.domain.dao.UserInfoDao;
import strategy.dao.userinfo.domain.entity.UserInfo;
import strategy.dao.userinfo.web.UserInfoController;

public class UserInfoClient {

    public static void main(String[] args) throws Exception{
        Properties prop = new Properties();

        InputStream inputStream = new FileInputStream("src/strategy/dao/userinfo/db.properties");
        prop.load(inputStream);

        // get value by key
        String dbtype = prop.getProperty("DBTYPE");
        UserInfoDaoFactory userInfoDaoFactory = UserInfoDaoFactory.getInstance();
        UserInfoDao userInfoDao = userInfoDaoFactory.getUserInfoDao(dbtype);

        UserInfoController userInfoController = new UserInfoController(userInfoDao);
        //UserInfo 객체 생성
        UserInfo userInfo1 = new UserInfo();
        userInfo1.setUserId("12345");
        userInfo1.setPasswd("passwd1");
        userInfo1.setUserName("userName1");


        userInfoController.requestInsert(userInfo1);
        userInfoController.requestDelete(userInfo1.getUserId());
        userInfoController.requestUpdate(userInfo1);
    }

}
