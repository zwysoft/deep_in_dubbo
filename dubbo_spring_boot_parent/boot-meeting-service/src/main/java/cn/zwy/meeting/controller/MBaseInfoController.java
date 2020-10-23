package cn.zwy.meeting.controller;


import cn.zwy.meeting.bean.MBaseInfo;
import cn.zwy.meeting.service.rpc.IMBaseInfoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
public class MBaseInfoController {

    @Autowired
    private IMBaseInfoService baseInfoService;

    @PostMapping("/edit")
    public String edit(@RequestBody MBaseInfo body){
        if(body.getId() == null){
            baseInfoService.save(body);
        } else {
            baseInfoService.updateById(body);
        }
        return "OK";
    }

    @GetMapping("/by-code")
    @ApiOperation("根据code查询")
    public MBaseInfo getByCode(String code){
        return baseInfoService.selectByCode(code);
    }

}
