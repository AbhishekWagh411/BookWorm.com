package com.bookworm.service;

import java.util.List;

import com.bookworm.entity.AttributeMaster;


public interface AttributeMasterInterface 
{
   List<AttributeMaster> getAllAttribute();
   void addAttribute(AttributeMaster a);
   void delete(int id);
   void update(AttributeMaster a, int id);
}