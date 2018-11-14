package com.example.meetalluserinfoproducer.service.impl;

import com.example.meetalluserinfoproducer.entity.Member;
import com.example.meetalluserinfoproducer.entity.User;
import com.example.meetalluserinfoproducer.dao.UserDao;
import com.example.meetalluserinfoproducer.entity.UserAndMember;
import com.example.meetalluserinfoproducer.result.AjaxResult;
import com.example.meetalluserinfoproducer.service.MemberService;
import com.example.meetalluserinfoproducer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2018-11-09 09:26:29
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Autowired
    private MemberService memberService;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserAndMember queryById(Integer id) {
        UserAndMember uam = new UserAndMember();
        User user = this.userDao.queryById(id);
        if (user == null ){
            return uam = null;
        }
        if (user.getScreenName() == null || "".equals(user.getScreenName())){
            user.setScreenName(getStringRandom());
            updateScreenName(id,user.getScreenName());
        }
        Member member = memberService.queryById(id);
        uam.setId(id);
        uam.setHeadurl(user.getHeadurl());
        uam.setMember(member.getMember());
        uam.setScreenName(user.getScreenName());
        return uam;
    }

    /**
     * 生成用户网名
     * @return
     */
    public String getStringRandom() {
        String val ="";
        Random random = new Random();
        for (int i = 0;i < 10 ; i++){
            String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num";
            //输出字母还是数字
            if ("char".equalsIgnoreCase(charOrNum)){
                //输出是大写字母还是小写字母
                int temp = random.nextInt(2) % 2 == 0 ? 65 : 97;
                val += (char)(random.nextInt(26) + temp);
            }else if ("num".equalsIgnoreCase(charOrNum)){
                val += String.valueOf(random.nextInt(10));
            }
        }
        return val;
    }
        /**
         * 查询多条数据
         *
         * @param offset 查询起始位置
         * @param limit 查询条数
         * @return 对象列表
         */
    @Override
    public List<User> queryAllByLimit(int offset, int limit) {
        return this.userDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public AjaxResult insert(User user) {
        int insert = this.userDao.insert(user);
        if (insert != 1){
            return AjaxResult.error("用户信息不合法");
        }
        return AjaxResult.success("新增用户成功");
    }

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public boolean update(User user) {

        int update = this.userDao.update(user);

        if (update == 1){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.userDao.deleteById(id) > 0;
    }

    /**
     * 修改用户网名
     * @param id
     * @param screenName
     * @return
     */
    @Override
    public int updateScreenName(Integer id, String screenName) {
        return userDao.updateScreenName(id,screenName);
    }
}