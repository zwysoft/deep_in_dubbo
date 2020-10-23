package cn.zwy.user.controller;


import cn.zwy.user.bean.UBaseInfo;
import cn.zwy.user.service.IUBaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户-基础信息 前端控制器
 * </p>
 *
 * @author mrzhaowy
 * @since 2020-10-20
 */
@RestController
@RequestMapping("/user/u-base-info")
public class UBaseInfoController {

    @Autowired
    private IUBaseInfoService baseInfoService;

    @PostMapping("/edit")
    public String edit(@RequestBody UBaseInfo body){
        if(body.getId() == null){
            baseInfoService.save(body);
        } else {
            baseInfoService.updateById(body);
        }
        return "OK";
    }

}
