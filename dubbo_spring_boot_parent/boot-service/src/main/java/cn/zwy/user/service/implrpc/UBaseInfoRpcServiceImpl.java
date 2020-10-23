package cn.zwy.user.service.implrpc;

import cn.zwy.pay.service.rpc.UserAmountRpcService;
import cn.zwy.user.bean.UBaseInfo;
import cn.zwy.user.service.IUBaseInfoService;
import cn.zwy.user.service.rpc.UserRpcService;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.cluster.LoadBalance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @author mrzhaowy
 * @create 2020-10-22 下午11:37
 **/
@Service
@com.alibaba.dubbo.config.annotation.Service
public class UBaseInfoRpcServiceImpl implements UserRpcService {

    @Autowired
    private IUBaseInfoService baseInfoService;

    @Reference(check = false, loadbalance = "roundrobin")
    private UserAmountRpcService userAmountRpcService;

    @Override
    public UBaseInfo getById(Serializable id) {
        UBaseInfo uBaseInfo = baseInfoService.getById(id);
        uBaseInfo.setUserAmount(userAmountRpcService.getByUserId(id));
        return uBaseInfo;
    }
}
