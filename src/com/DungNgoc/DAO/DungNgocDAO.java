/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DungNgoc.DAO;

import java.util.List;

/**
 *
 * @author Admin
 * @param <EntityType>
 * @param <KeyType>
 */
public interface DungNgocDAO<EntityType,KeyType> {
    public void insert(EntityType entity);
    public void update(EntityType entity);
    public void disable(KeyType id);
    public void reStore(KeyType id);
    public EntityType selectById(KeyType id);
    public List<EntityType> selectByPage(int page);
    public List<EntityType> selectBySql(String sql,Object... args);
}
