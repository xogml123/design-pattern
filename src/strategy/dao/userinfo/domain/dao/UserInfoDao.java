package strategy.dao.userinfo.domain.dao;

import strategy.dao.userinfo.domain.entity.UserInfo;

public interface UserInfoDao {

    void insert(UserInfo userInfo);

    void delete(String userId);

    void update(UserInfo userInfo);
}
