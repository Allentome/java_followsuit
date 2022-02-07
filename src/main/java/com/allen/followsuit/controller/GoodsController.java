
package com.allen.followsuit.controller;

import com.allen.followsuit.common.Result;
import com.allen.followsuit.entity.Goods;
import com.allen.followsuit.service.GoodsService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/data_goods")
public class GoodsController {

    @Resource
    private GoodsService goodsService;

    @PostMapping
    public Result add(@RequestBody Goods goods) {
        goodsService.save(goods);
        return Result.success();
    }

    @PutMapping
    public Result update(@RequestBody Goods goods) {
        goodsService.save(goods);
        return Result.success();
    }

//    @DeleteMapping("/{id}")
//    public Result delete(@PathVariable("id") Long id){
//        goodsService.del(id);
//        return Result.success();
//    }

    @GetMapping("/delete/{goodsid}")
    public Result delete(@PathVariable("goodsid") Long goodsid) {
        goodsService.del(goodsid);
        return Result.success();
    }


    @GetMapping
    public Result<List<Goods>> findAllgoods() {
        return Result.success(goodsService.findAllgoods());
    }

    @GetMapping("/test")
    public Result<List<Goods>> testfindid() {
        return Result.success(goodsService.testid());
    }

    @DeleteMapping("/testdel/{name}")
    public Result testdel(@PathVariable("name") String name) {
        goodsService.testdel(name);
        return Result.success();
    }

    @GetMapping("/page")
    public Result<Page<Goods>> findPage(@RequestParam(defaultValue = "1") Integer pageNum,
                                        @RequestParam(defaultValue = "10") Integer pageSize,
                                        @RequestParam(required = false) String name) {
        return Result.success(goodsService.findPage(pageNum, pageSize, name));
    }
}