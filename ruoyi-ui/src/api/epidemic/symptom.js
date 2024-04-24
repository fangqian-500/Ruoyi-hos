import request from '@/utils/request'

// 查询异样报告列表
export function listSymptom(query) {
  return request({
    url: '/epidemic/symptom/list',
    method: 'get',
    params: query
  })
}

// 查询异样报告详细
export function getSymptom(id) {
  return request({
    url: '/epidemic/symptom/' + id,
    method: 'get'
  })
}

// 新增异样报告
export function addSymptom(data) {
  return request({
    url: '/epidemic/symptom',
    method: 'post',
    data: data
  })
}

// 修改异样报告
export function updateSymptom(data) {
  return request({
    url: '/epidemic/symptom',
    method: 'put',
    data: data
  })
}

// 删除异样报告
export function delSymptom(id) {
  return request({
    url: '/epidemic/symptom/' + id,
    method: 'delete'
  })
}
