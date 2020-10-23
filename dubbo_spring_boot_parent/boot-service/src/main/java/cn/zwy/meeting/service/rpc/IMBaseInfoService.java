package cn.zwy.meeting.service.rpc;


import cn.zwy.meeting.bean.MBaseInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 会议-会议基础 服务类
 * </p>
 *
 * @author mrzhaowy
 * @since 2020-10-22
 */
public interface IMBaseInfoService extends IService<MBaseInfo> {


    MBaseInfo selectByCode(String code);
}
