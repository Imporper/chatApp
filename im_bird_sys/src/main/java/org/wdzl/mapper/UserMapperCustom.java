package org.wdzl.mapper;

import org.wdzl.vo.FriendsRequestVO;
import org.wdzl.vo.MyFriendsVO;

import java.util.List;

public interface UserMapperCustom {
    List<FriendsRequestVO> queryFriendRequestList(String acceptUserId);
    List<MyFriendsVO> queryMyFriends(String userId);
    void batchUpdateMsgSigned(List<String> msgIdList);

}
