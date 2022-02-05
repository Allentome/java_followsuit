<<<<<<< HEAD
package com.allen.followsuit.service;

import com.allen.followsuit.dao.GoodsDao;
import com.allen.followsuit.entity.Goods;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsService {

    @Resource
    private GoodsDao goodsDao;

    public void save(Goods goods){
        goodsDao.save(goods);
    }

    public void del(Long goodsid){
        goodsDao.deleteById(goodsid);
    }

    public List<Goods> findAllgoods(){
        return goodsDao.findAll();
    }

    public List<Goods> testid(){
        return goodsDao.testfindid();
    }
    public void testdel(String name){
        goodsDao.testdel(name);
    }

    public Page<Goods> findPage(Integer pageNum, Integer pageSize, String name){
        Sort sort = Sort.by(Sort.Direction.DESC,"date");
        PageRequest request = PageRequest.of(pageNum-1,pageSize,sort);
        return goodsDao.findNameLike(name,request);
    }
}
=======
package com.allen.followsuit.service;

import com.allen.followsuit.dao.GoodsDao;
import com.allen.followsuit.entity.Goods;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsService {

    @Resource
    private GoodsDao goodsDao;

    public void save(Goods goods){
        goodsDao.save(goods);
    }

    public void del(Long goodsid){
        goodsDao.deleteById(goodsid);
    }

    public List<Goods> findAllgoods(){
        return goodsDao.findAll();
    }

    public List<Goods> testid(){
        return goodsDao.testfindid();
    }
    public void testdel(String name){
        goodsDao.testdel(name);
    }

    public Page<Goods> findPage(Integer pageNum, Integer pageSize, String name){
        Sort sort = Sort.by(Sort.Direction.DESC,"date");
        PageRequest request = PageRequest.of(pageNum-1,pageSize,sort);
        return goodsDao.findNameLike(name,request);
    }
}
>>>>>>> b97d8588d5aabe3fae76e28b18f008c6fab54745
