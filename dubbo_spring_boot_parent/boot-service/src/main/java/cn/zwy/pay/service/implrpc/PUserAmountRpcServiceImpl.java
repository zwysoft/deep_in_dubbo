package cn.zwy.pay.service.implrpc;

import cn.zwy.pay.bean.PUserAmount;
import cn.zwy.pay.service.IPUserAmountService;
import cn.zwy.pay.service.rpc.UserAmountRpcService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @author mrzhaowy
 * @create 2020-10-23 上午11:32
 **/
@Service
@com.alibaba.dubbo.config.annotation.Service
@Log
public class PUserAmountRpcServiceImpl implements UserAmountRpcService {

    @Autowired
    private IPUserAmountService userAmountService;

    @Value("${server.port}")
    private int port;

    @Override
    public PUserAmount getByUserId(Serializable id) {
        QueryWrapper<PUserAmount> wrapper = new QueryWrapper<>();
        wrapper.eq("user_id", id);
        log.info("server.port:" + port);
        return userAmountService.getOne(wrapper);
    }
}
