package cn.zwy.meeting.service.rpc.impl;

import cn.zwy.meeting.bean.MBaseInfo;
import cn.zwy.meeting.mapper.MBaseInfoMapper;
import cn.zwy.meeting.service.rpc.IMBaseInfoService;
import cn.zwy.user.service.rpc.UserRpcService;
import com.alibaba.dubbo.config.annotation.Reference;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会议-会议基础 服务实现类
 * </p>
 *
 * @author mrzhaowy
 * @since 2020-10-22
 */
@Service
public class MBaseInfoServiceImpl extends ServiceImpl<MBaseInfoMapper, MBaseInfo> implements IMBaseInfoService {

    @Reference(check = false)
    private UserRpcService userRpcService;

    @Override
    public MBaseInfo selectByCode(String code) {
        QueryWrapper<MBaseInfo> wrapper = new QueryWrapper<>();
        wrapper.eq("code", code);
        MBaseInfo mBaseInfo = this.baseMapper.selectOne(wrapper);
        if(mBaseInfo != null){
            mBaseInfo.setUser(userRpcService.getById(mBaseInfo.getUserId()));
        }
        return mBaseInfo;
    }
}
