<<<<<<< HEAD
package com.allen.followsuit.dao;

import com.allen.followsuit.entity.Goods;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface GoodsDao extends JpaRepository<Goods, Long> {

    @Query(value = "select * from goods where name like %?1%", nativeQuery = true)
    Page<Goods> findNameLike(String name, PageRequest request);


    @Query(value = "select * from goods where goodsid = '1' ", nativeQuery = true)
    List<Goods> testfindid();


    @Modifying
    @Transactional
    @Query(value = "delete from goods where name = ?1 ",nativeQuery = true)
    void testdel(String name);
}
=======
package com.allen.followsuit.dao;

import com.allen.followsuit.entity.Goods;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface GoodsDao extends JpaRepository<Goods, Long> {

    @Query(value = "select * from goods where name like %?1%", nativeQuery = true)
    Page<Goods> findNameLike(String name, PageRequest request);


    @Query(value = "select * from goods where goodsid = '1' ", nativeQuery = true)
    List<Goods> testfindid();


    @Modifying
    @Transactional
    @Query(value = "delete from goods where name = ?1 ",nativeQuery = true)
    void testdel(String name);
}
>>>>>>> b97d8588d5aabe3fae76e28b18f008c6fab54745
