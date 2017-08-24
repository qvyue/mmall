package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Category;

import java.util.List;

public interface ICategoryService {
    ServerResponse addCategory(String categoryName, Integer parentId);

    ServerResponse updateCategoryName(String categoryName, Integer catogoryId);

    ServerResponse<List<Category>> getChildrenParallelCategory(Integer catogoryId);

    ServerResponse<List<Integer>> getCategoryAndChildren(Integer catogoryId);
}
